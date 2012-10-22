@echo off
setlocal ENABLEEXTENSIONS


mkdir data\xml\daily
(for %%f in (data\xml\individual\*) do @type %%f) >> data\xml\daily\txns-2012-03-01.xml

mkdir data\xml\dailyLarge
type data\xml\daily\txns-2012-03-01.xml data\xml\daily\txns-2012-03-01.xml > data\xml\dailyLarge\1.xml
type data\xml\dailyLarge\1.xml data\xml\dailyLarge\1.xml data\xml\dailyLarge\1.xml > data\xml\dailyLarge\2.xml
type data\xml\dailyLarge\2.xml data\xml\dailyLarge\2.xml data\xml\dailyLarge\2.xml > data\xml\dailyLarge\3.xml
type data\xml\dailyLarge\3.xml data\xml\dailyLarge\3.xml data\xml\dailyLarge\3.xml > data\xml\dailyLarge\txns-4.xml

del data\xml\dailyLarge\1.xml
del data\xml\dailyLarge\2.xml
del data\xml\dailyLarge\3.xml

endlocal