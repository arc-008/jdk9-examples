## To run this example,

**Compiling modules separately,**

  `mkdir -p mods/dependable mods/dependant`

  `javac -d mods/dependable src/dependable/module-info.java src/dependable/com/siv/dependable/Dependable.java`

  `javac --module-path mods -d mods/dependant src/dependant/module-info.java src/dependant/com/siv/dependant/Dependant.java`

  `java --module-path mods -m dependant/com.siv.dependant.Dependant`


**Multi-Module compilation** (unix environment)

  `mkdir mods`

  `javac -d mods --module-source-path src $(find src -name "*.java")`

  `java --module-path mods -m dependant/com.siv.dependant.Dependant`