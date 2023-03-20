Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then user shold see fruits I like
    |Kivi|
    |banana|
    |cucumber|
    |orange  |
    |mango   |
    |grape   |
    |pomegranate|

    #to beautify the pipes above
  #mac: command + option + L
  #windows: control + alt + L