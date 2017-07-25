
mkdir serenity

mvn verify  -Dwebdriver.driver=chrome -Denv=staging -Pb1
mvn serenity:aggregate -Pserenity
mv  target/site/serenity serenity/firefox
mv  serenity target/site/serenity

echo done
