## To run this example,

** mkdir -p mods/dependable mods/dependant **

** javac -d mods/dependable src/dependable/module-info.java src/dependable/com/siv/dependable/Dependable.java **

** javac --module-path mods -d mods/dependant src/dependant/module-info.java src/dependant/com/siv/dependant/Dependant.java **

** java --module-path mods -m dependant/com.siv.dependant.Dependant **