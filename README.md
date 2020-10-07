# polls

The tech stack here is a simple Springboot application with an in memory h2 database, upon startup the application will populate the data from the polls.json file.

I choose this stack because it's very simple and the most appropriate for this use case, also for a production usage it's really simple just to change the datasource in the application configs for something like Postgresql or others.

I prioritized the architecture and code readability over other things, because they are very important as a first step, if I had more time I would focus also on the performance side by adding DB indexes and optimizing in the right places.  