# UCSDUnfoldingMaps

Object oriented programming project using Java to visualize real time earthquake data using UnfoldingMap Lib and Porcessing GUI
Interactive earthquake map with real time update

Main Features :
1. Keyboard shortcuts
  - Change map providers
  - Show only the recent earthquakes or show it all
2. Mouse Hover
  - Show a marker's detail drawn on top of other graphics
  - Dynamic latitude and longitude on the lower right side of the map
3. Mouse Clicks
  - When clicking a city marker:
    - Shows the airports within 50km
    - Shows an earthquake if the city is affected by its threat circle
    - Hides other city marker
    - A popup menu appears on the left side of the map to show the count of nearby earthquakes, average magnitude, and the most recent earthquake occurred
  - When clicking an earthquake marker:
    - Shows a city marker if it is within its threat circle
    - Shows airports affected by its threat circle
    - Hides other earthquake marker
    
  Final Project is located in UCSDUnfoldingMaps/src/module6/
