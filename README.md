<p align="center">
  <img src="https://wallpapercave.com/wp/wp2046309.jpg"/>
</p>

<h1 align="center">
    DialogPreviewImage
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:DialogPreviewImage:version'
  implementation 'com.github.gzeinnumer:MyLibDialogFragment:1.0.1'
}
```

---
# Feature List
- [x] [Image From Bitmap](#image-from-bitmap)
- [x] [Image From Path/File Image](#image-from-pathfile-image)
- [x] [Add Content Message](#add-content-message)
- [x] [Enable Zoom Image](#enable-zoom-image)

---
# Tech stack and 3rd library
- [DialogFragment](https://developer.android.com/reference/android/app/DialogFragment)
- [ZoomLayout](https://github.com/natario1/ZoomLayout)

---
# Usage

### Image From Bitmap
```java
Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
new DialogPreviewImage(getSupportFragmentManager()).setImage(bitmap).show();
```

#
### Image From Path/File Image

Required permission to external/internal
```java
String path = "YOUR_IMAGE_PATH";
new DialogPreviewImage(getSupportFragmentManager()).setImage(path).show();
```

#
### Add Content Message
```java
new DialogPreviewImage(getSupportFragmentManager())
    .setContent("ini content")
    ...
    .show();
```

#
### Enable Zoom Image
```java
new DialogPreviewImage(getSupportFragmentManager())
    .enableZoom()
    ...
    .show();
```

Preview :
|<img src="https://github.com/gzeinnumer/DialogPreviewImage/blob/master/preview/example1.gif"/>|<img src="https://github.com/gzeinnumer/DialogPreviewImage/blob/master/preview/example2.gif"/>|<img src="https://github.com/gzeinnumer/DialogPreviewImage/blob/master/preview/example3.gif"/>|
|---|---|---|
|Image Preview|Add Content Message|Enable Zoom Image|

---
# Example Code/App

[MainActivity.java](https://github.com/gzeinnumer/DialogPreviewImage/blob/master/app/src/main/java/com/gzeinnumer/dialogpreviewimage/MainActivity.java) & [activity_main.xml](https://github.com/gzeinnumer/DialogPreviewImage/blob/master/app/src/main/res/layout/activity_main.xml)

[Sample Code And App](https://github.com/gzeinnumer/DialogPreviewImageExample)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2021 M. Fadli Zein
```
