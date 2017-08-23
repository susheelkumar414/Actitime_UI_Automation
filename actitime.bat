set projectLocation=C:\Users\swadageri\susheelworkbook\ui-automation-actitime
cd %projectLocation%
set classpath=%projectLocation%\\target\test-classes\com\actitime\tests;%projectLocation%\jars\*
java org.testng.TestNg testng.xml
pause