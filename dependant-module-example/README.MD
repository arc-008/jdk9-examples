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

**Packing modules separately,
  
	`mkdir mod-lib`
  
	`jar --create --file=mod-lib/dependable@1.0.jar --module-version=1.0 -C mods/dependable .`
  
	`jar --create --file=mod-lib/dependant.jar --main-class=com.siv.dependant.Dependant -C mods/dependant .`
	
	`ls mod-lib`
	
	Now we can run using just the module name,
	`java -p mod-lib -m dependant`
	
	Note: Here `dependant` is not the jar name, it is the module name.