package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation(){
        //가장 처음 표시할 fragment 설정
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_frame,HomeFragment())
            .commitAllowingStateLoss()

        //가장 처음 아이콘 지정
        viewBinding.btmNav.selectedItemId=R.id.bnb_home

        //기존에 등록한 혹은 Theme에 의해 구조적으로 포함되어 있는 Tint를 초기화 시켜준다
        viewBinding.btmNav.itemIconTintList=null

        //각 Item 클릭이벤트 설정
        viewBinding.btmNav.run{
            setOnItemSelectedListener { item->
                when (item.itemId){
                    R.id.bnb_home->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.main_frame,HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.bnb_mypage->{
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frame,MypageFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.bnb_myschool->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.main_frame,MyschoolFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
        }
    }

}