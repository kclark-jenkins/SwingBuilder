# SwingBuilder

SwingBuilder is a library that makes it possible to create a basic Swing UI using nothing but JSON.

My insperation behind this project was to make it easier to create simple swing applications since I prefer JavaFX.


  - Reads config.properties from the classpath by default
  - A custom config.properties can be passed via constructor 
  - Returns a JFrame for you to add to the UI.

Swing items currently implemented:
  - JFrame
  - JMenu

### Requirements

To run
  - Java 8+ (Lambda's)

To build
  - Java 8+ (Lambda's)
  - Gradle  (Depencency managemtn)

### Example config.json
```$json
{
  "app": {
    "title":   "Test",
    "height":  300,
    "width":   300,
    "visible": true
  },
  "menu": {
    "File": {
      "KeyEvent": "VK_F",

      "FileChildren": {
        "child":         ["Open...", "Exit"],
        "childKeyEvent": ["VK_O",    "VK_X"]
      }
    },
    "Edit": {
      "KeyEvent": "VK_E",

      "EditChildren": {
        "child":         ["Preferences"],
        "childKeyEvent": ["VK_P"]
      }
    },
    "View": {
      "KeyEvent": "VK_V",

      "ViewChildren": {
        "child":         [""],
        "childKeyEvent": [""]
      }
    },
    "Help": {
      "KeyEvent": "VK_H",

      "HelpChildren": {
        "child":         ["About"],
        "childKeyEvent": ["VK_A"]
      }
    }
  },
  "birt": {
    "home": "/opt/opentext/informationhub"
  }
}
```

### Example use

```$java
package org.krisbox.birt.example;

import org.krisbox.swing.builder.impl.SwingBuilderImpl;

import javax.swing.*;

public class BirtSwingExample {
    JFrame birtSwingExample;

    public BirtSwingExample() {
        // Create the Swing UI and return the JFrame
        birtSwingExample = new SwingBuilderImpl().buildSwing();
        
        // Do more things and stuff to our UI
    }

    public static void main(String[] args) {
        new BirtSwingExample();
    }
}
```

### Development

Want to contribute?  Clone the repo!  There are a ton of components in swing and I just don't have the time to add them all since this is just a side project.

License
----

MIT
