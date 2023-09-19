# Hall of Heroes
## What is This?
  - Using Spring Boot, I have created a Docker Container that can be run on computers with Docker installed.
  - This container is a simple JSON database with a few video game heroes of mine. It contains their name, their weapon of choice, what series they're from, and a quote from them with a video on the page.
  
## How to Use
  1. Download zip and put in a folder of your choice.
  2. Navigate to the munozpage folder.
  3. type in `docker build -t munozpage .` and let it run
  4. type in `docker run -p 8081:8080 munozpage`
    - 8080 might already be running on your system. So, putting 8081 instead allows us to see the container's port 8080 on port 8081 in the host system.
  5. Navigate the site.

## What it Does
  1. I have implemented four endpoints
  2. /heroes which shows us the heroes in the json database
  3. /factoids which shows us the weapons and a quote from the heros
  4. /heroes/{id} shows a specific hero in the database for a more personalized view
  5. heroes/{id}/factoids/{id} gives us the weapon and quote from a specific hero.
  6. There are personalized pages to make this information more enjoyable as well, with links in the home page.
