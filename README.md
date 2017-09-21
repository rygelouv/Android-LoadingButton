# Android LoadingButton

Android LoadingButton is library that let you create a button with a loading state

When the button is clicked on, it is passed to a disabled state and a small circular progressbar shows up inside the button
and you have the ability to change the button text during the loading process.
After the loading is done, the progress is dismissed, the button comes back to an enabled state
and you can also change the text.

![alt text](https://github.com/Rygelouv/Android-LoadingButton/blob/master/Screenshot_1506014020.png)
![alt text](https://github.com/Rygelouv/Android-LoadingButton/blob/master/Screenshot_1506014029.png)

**This library does not use any other library to do his job it's a very small and lightweight library**

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    compile 'com.github.Rygelouv:Android-LoadingButton:v1.1'
}
```

# Create A LoadinButton

```xml
<com.github.rygelouv.androidloadingbuttonlib.LoadingButton
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button_test"
        custom:text="Validate"
        custom:textColor="@android:color/white"
        custom:background="@drawable/button_accent_full"
        custom:textSize="12sp"
        android:layout_margin="16dp"
        custom:progressColor="@android:color/white"
        />
````

Available attributes :
- `text` : The text for the button
- `textColor`: The textColor
- `textSize`: The button TextSize
- `background`: The drawable background of the button
- `backgroundColor`: The background color of the button
- `progressColor`: The color to be set on the circular progressBar

# Start and stop loading

You have two method that let you start stop the loading state of the button, for example

Using `startLoading()`

```java
((LoadingButton)findViewById(R.id.button_test))
                        .startLoading("Loading...");
```

Or `compose`

```
((LoadingButton)findViewById(R.id.button_test))
                        .stopLoading("Done!");
```

# Credits

Author: Rygel Louv [http://www.rygelouv.wordpress.com/](http://www.rygelouv.wordpress.com/)


License
--------

    Copyright 2017 Rygelouv.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.