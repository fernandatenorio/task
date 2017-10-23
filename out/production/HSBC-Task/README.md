Environment of development
 - MacOS
 - Chrome browser
 - Intellij

How to execute
 - Open the project through IDE
 - Select 'AddItemOnCart' and click to Run
 - If you are in an enviroment different from environment of development
    - Download the chromedriver according to your Operating System
    - Go to Connection class and replace "chromedriver" on line 11 by the path
    of the chromedriver that you just downloaded
 - It is not necessary download jars for selenium and junit because they are
 already in project folder

 Experience during development
  - Amazon is a website that has dynamic items, like cameras section element
  that at the begin of the development it was 'desktop2', in the end it became
  'desktop-3'. Also, this website hasn't id enough to develop suites which
  can have easy maintanance. Most of the time I needed to use classes, tag names,
  indexes, and xpath, which is a practice that I don't recomend, once if the
  structure changes, the tests have more chances to be changed then using ids
  side effects.
