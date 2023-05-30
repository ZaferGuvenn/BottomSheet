# BottomSheet
bottom sheet dialog with animation.

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
