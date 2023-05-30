package com.lafimsize.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.view.animation.AnimationUtils
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.lafimsize.bottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dialog:Dialog

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.bottomSheetDialogOpen.setOnClickListener {

            openDialog()
        }

    }


    private fun openDialog(){

        val contentView=layoutInflater.inflate(R.layout.fragment_dialog,null)



        dialog=BottomSheetDialog(this,R.style.DialogAnimationAndStyle)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        dialog.setContentView(contentView)

        dialog.window?.attributes?.windowAnimations=R.style.DialogAnimationAndStyle


        dialog.show()





    }


}