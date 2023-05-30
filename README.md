# BottomSheet

   # Open dialog fun, when click button
    private fun openDialog(){
        val contentView=layoutInflater.inflate(R.layout.fragment_dialog,null)
        dialog=BottomSheetDialog(this,R.style.DialogAnimationAndStyle)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(contentView)
        dialog.window?.attributes?.windowAnimations=R.style.DialogAnimationAndStyle
        dialog.show()
    }
    
    
   # Style.xml
    <style name="BottomSheetBack" parent="Widget.Design.BottomSheet.Modal">
        <item name="android:background">#00000000</item>
    </style>
    <style name="DialogAnimationAndStyle" parent="Theme.MaterialComponents.Light.BottomSheetDialog" >
        <item name="android:windowEnterAnimation">@anim/slide_in</item>
        <item name="android:windowExitAnimation">@anim/slide_out</item>
        <item name="bottomSheetStyle">@style/BottomSheetBack</item>
    </style>
