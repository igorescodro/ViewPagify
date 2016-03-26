# ViewPagify

ViewPagify is a ViewPager similar to the one used in Spotify Player. It creates a <i>cover flow</i> effect where the selected album appears bigger in the middle of the screen, showing a sneak peak of the next and previous albums. It is a great view to be used in a Music Player or Album Store application.
It also contains by default the same animation used in Spotify, where the next and previous are smaller than the focused one, and they change their size during the scroll.

## Screenshot
![pagify](http://i.imgur.com/bFFvCu9.gif)

## Quick Setup
Download the <i>library</i> module and import into your project.

### Usage

Once imported, add the ViewPagify in yout layout.
``` xml
<com.escodro.viewpagify.ViewPagify
        android:id="@+id/viewPagify"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

 - Despite being a ViewPager with some tricks, ViewPagify uses the good ol' `FragmentStatePagerAdapter`

### Important notes
We strongly recommend to use a image loading and caching library or mechanism, like [Picasso](http://square.github.io/picasso/) or [Glide](https://github.com/bumptech/glide) to load the images in the ViewPagify. These libraries handle all the recycling, memory and caching process.
For more information about handling images, visit [Displaying Bitmaps Efficiently](http://developer.android.com/intl/pt-br/training/displaying-bitmaps/index.html)

### Attributes
Currently, it is possible to set two attributes in the XML file. They are:

 - `horizontalPadding` - Sets the padding between the fragments in the ViewPagerfy. Greater is the padding, smaller is the fragment and the distance between the cover arts.
 - `changeItemByClick` - Enable/Disable click to next/previous feature. If <i>true</i>, when you click in a sneak peak, the ViewPagify you change to the clicked item.

###Feeling confused?
Download the <i>demo</i> module and give a try! It contains the basic UI implementation of a music player.

##License
``` 
Copyright 2016 Igor Escodro

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
``` 
