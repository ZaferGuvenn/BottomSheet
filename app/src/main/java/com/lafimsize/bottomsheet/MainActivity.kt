package com.lafimsize.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
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

        val sheet=findViewById<FrameLayout>(R.id.bttmsheet)

        BottomSheetBehavior.from(sheet).apply {
            peekHeight=200
            //state=BottomSheetBehavior.STATE_COLLAPSED

        }

    }


    private fun openDialog(){


        dialog=Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        dialog.setContentView(R.layout.fragment_dialog)


        dialog.show()
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.window?.attributes?.windowAnimations=R.style.DialogAnimation
        dialog.window?.setGravity(Gravity.BOTTOM)





    }


}