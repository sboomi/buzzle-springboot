DROP TABLE IF EXISTS users, blogs, messages;
CREATE TABLE users(id serial PRIMARY KEY, username VARCHAR(24) NOT NULL , password VARCHAR(36) NOT NULL, mail VARCHAR(50) NOT NULL);
CREATE TABLE blogs(id serial PRIMARY KEY, namedomain VARCHAR(24) NOT NULL , title VARCHAR(50) NOT NULL, users_id INT);
CREATE TABLE messages(id serial PRIMARY KEY , title varchar(30), category varchar(10) NOT NULL , hashtags varchar(550),
                      date TIMESTAMP NOT NULL , likes INT, content VARCHAR(5000) NOT NULL, blogs_id INT);
