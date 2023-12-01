
## Step to Test 

- Generate/build apk [which will stored inside server/build/outputs/apk/debug folder]
- Run the client version of app to device/Emulator
- Now install server/apk build to device/Emulator
  - adb install server/build/outputs/apk/debug/server-debug.apk
  - adb -s 90e47ba8 install server/build/outputs/apk/debug/server-debug.apk
- Once both build is installed the click on button to see colour changes on screen

# Assets
![output.gif](screenshot%2Foutput.gif)


# Mp4 to gif convert command
ffmpeg \
-i file.mp4 \
-ss 00:00:10.000 \
-pix_fmt rgb24 \
-r 10 \
-s 420x800 \
-t 00:00:10.000 \
output.gif
