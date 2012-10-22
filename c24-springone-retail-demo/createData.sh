#!/bin/sh

unzip data.zip

mkdir -p data/xml/daily
for f in data/xml/individual/*; do cat $f >> data/xml/daily/txns-2012-03-01.xml; done

mkdir -p data/xml/dailyLarge
cat data/xml/daily/txns-2012-03-01.xml data/xml/daily/txns-2012-03-01.xml > data/xml/dailyLarge/1.xml
cat data/xml/dailyLarge/1.xml data/xml/dailyLarge/1.xml > data/xml/dailyLarge/2.xml
cat data/xml/dailyLarge/2.xml data/xml/dailyLarge/2.xml data/xml/dailyLarge/2.xml > data/xml/dailyLarge/3.xml
cat data/xml/dailyLarge/3.xml data/xml/dailyLarge/3.xml data/xml/dailyLarge/3.xml > data/xml/dailyLarge/txns-4.xml
rm data/xml/dailyLarge/1.xml
rm data/xml/dailyLarge/2.xml
rm data/xml/dailyLarge/3.xml

mkdir -p data/xml/weeklyzip
zip data/xml/weeklyzip/txns-2012-03-01.zip data/xml/daily/txns-2012-03-01.xml
