//Components of selenium


//-Client binding/language binding
//-w3c protocol
//-driver executable files
//-browser

/*Search context(I)
-----------------

-It is an interface which helps in finding out the web element in an web page
-It is considered to be the super most interface in selenium

---->web driver(I)------>remote web driver(C)---->chromeDriver,firefoxDriver,msedgeDriver(C)
---->TakesScreenshot(I)
---->javaScript Executor(I)

1.findElement()
2.findElements()


1. Webdriver
-------------

All browser related operations are performed by using webdriver
11 abstract methods
2 inherited methods from search context

11 abstract methods
---->get
---->getCurrentURL
---->getTitle
---->getPageSource
---->getWindowHandle
---->manage
---->navigate
---->switchTo
---->close
---->quit
---->getWindowHandles


Manage
------

Window
timeout
cookies



window
------
->maximize
->minimize
->fullscreen
->setsize
->getsize
->setposition
->getposition


timout
------
->implicit wait
->explicit wait
->fluent wait


Navigate
-------
->back
->forward
->refresh
->to(String URL)
->to(URL URL)


switch to
---------
->Window
->frame
->alert


getWindowHandle
getWindowHandles

WebElements
-----------

14 abstract methods

click
sendKeys
getText
clear
submit
getAttribute
getCssValue
getTagName
getSize
getLocation
getRect
isDisplayed
isEnabled
isSelected

TakesScreenShot
---------------

getScreenShotAs()

LocalDateTime


DropDown
--------

In select tag,
then select by using selectbyValue
                     selectbyIndex
                     SelectbyVisibleText
                     
Deselect option

getFirstSelectedOption
getAllSelectedOption


Two types:
     Single Value Select
     Multiple Value Select
     

iframe
------

Switching to iframe is carried out based on id/name,index,web element.

To switch back:
-->defaultcontent()
-->parentframe()



Action Class
------------
Helps in performing keyboard related actions

->right click---------------->contextClick()
->double click
->click and hold
->mouse hover ---------------->moveToElement()
->drag and drop

Always use perform

*/



