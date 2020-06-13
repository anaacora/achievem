insert into ranking (id, level, stage, total_score) values (1, 1, 'beginner', 300);
insert into ranking (id, level, stage, total_score) values (2, 3, 'intermediate', 500);
insert into ranking (id, level, stage, total_score) values (3, 4, 'intermediate', 800);
insert into ranking (id, level, stage, total_score) values (4, 5, 'advanced', 900);
insert into ranking (id, level, stage, total_score) values (5, 7, 'advanced', 1000);
insert into ranking (id, level, stage, total_score) values (6, 9, 'advanced', 1200);
insert into ranking (id, level, stage, total_score) values (7, 10, 'pro', 2100);
insert into ranking (id, level, stage, total_score) values (8, 12, 'pro', 3000);


insert into user (id, name, password, registration_date, user_name, ranking_id) values (1, 'Anastasia', 'pw1', '2020-04-10 12:00:00', 'Anaabanana', 7);
insert into user (id, name, password, registration_date, user_name, ranking_id) values (2, 'Christian', 'pw2', '2020-04-11 12:00:00', 'ChrisTheBeast', 6);
insert into user (id, name, password, registration_date, user_name, ranking_id) values (3, 'Denise', 'pw3', '2020-04-12 12:00:00', 'PeaceDenise', 5);
insert into user (id, name, password, registration_date, user_name, ranking_id) values (4, 'Silvan', 'pw4', '2020-04-12 12:00:00', 'SilvanSuperman', 2);
insert into user (id, name, password, registration_date, user_name, ranking_id) values (5, 'To Delete', 'verybadpassword', '2020-04-10 12:00:00', 'deletemeee', 1);


insert into friendship (id, end_date, start_date, status, user_one, user_two) values (1, null, '2020-05-01 12:00:00', 'active', 1, 2);
insert into friendship (id, end_date, start_date, status, user_one, user_two) values (2, null, '2020-05-02 12:00:00', 'active', 1, 3);
insert into friendship (id, end_date, start_date, status, user_one, user_two) values (3, '2020-06-01 12:00:00', '2020-05-20 12:00:00', 'ended', 1, 4);
insert into friendship (id, end_date, start_date, status, user_one, user_two) values (4, null, '2020-05-10 12:00:00', 'new', 2, 4);
insert into friendship (id, end_date, start_date, status, user_one, user_two) values (5, null, '2020-05-10 12:00:00', 'new', 2, 3);


insert into award (id, category, collection_date, points, ranking_id) values (1, 'Health and Food', '2020-06-01 12:00:00', 50, 1);
insert into award (id, category, collection_date, points, ranking_id) values (2, 'Health and Food', '2020-06-01 12:00:00', 100, 1);
insert into award (id, category, collection_date, points, ranking_id) values (3, 'Health and Food', '2020-06-01 12:00:00', 200, 1);
insert into award (id, category, collection_date, points, ranking_id) values (4, 'Sports', '2020-06-01 12:00:00', 50, 1);
insert into award (id, category, collection_date, points, ranking_id) values (5, 'Education', '2020-06-01 12:00:00', 100, 1);
insert into award (id, category, collection_date, points, ranking_id) values (6, 'Lifestyle', '2020-06-01 12:00:00', 200, 1);
insert into award (id, category, collection_date, points, ranking_id) values (7, 'Lifestle', '2020-06-01 12:00:00', 50, 1);


insert into challenge (id, hashtag, end_date, start_date, award_id) values (1, 'foodischlebe', null, '2020-06-01 12:00:00', 1);
insert into challenge (id, hashtag, end_date, start_date, award_id) values (2, 'foodischlebe', '2020-06-10 12:00:00', '2020-06-01 12:00:00', 2);
insert into challenge (id, hashtag, end_date, start_date, award_id) values (3, 'sportyyy', '2020-06-10 12:00:00', '2020-06-01 12:00:00', 4);
insert into challenge (id, hashtag, end_date, start_date, award_id) values (4, 'learningshit', '2020-06-01 12:00:00', '2020-06-01 12:00:00', 5);
insert into challenge (id, hashtag, end_date, start_date, award_id) values (5, 'becoool', null, '2020-06-01 12:00:00', 6);
insert into challenge (id, hashtag, end_date, start_date, award_id) values (6, 'becoool', '2020-06-10 12:00:00', '2020-06-01 12:00:00', 7);


insert into friendship_challenge (friendship_id, challenge_id) values (1, 1);
insert into friendship_challenge (friendship_id, challenge_id) values (2, 2);
insert into friendship_challenge (friendship_id, challenge_id) values (3, 3);
insert into friendship_challenge (friendship_id, challenge_id) values (4, 4);
insert into friendship_challenge (friendship_id, challenge_id) values (5, 5);

insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (1, 'Health and Food', '2020-12-01 12:00:00', 'Drink Water', '50', '2020-05-10 12:00:00', 2, 'l', 'Daily', 1, 1);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (2, 'Lifestyle', '2020-12-01 12:00:00', 'No Phone', '50', '2020-05-01 12:00:00', 5, 'hours', 'Twice a Week', 6, 1);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (3, 'Education', '2020-12-01 12:00:00', 'Study', '50', '2020-06-01 12:00:00', 2, 'hours', 'Weekly', 5, 1);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (4, 'Sports', '2020-12-01 12:00:00', 'Go to the gym', '50', '2020-06-01 12:00:00', 1, 'time', 'Monthly', 4, 1);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (5, 'Lifestyle', '2020-12-01 12:00:00', 'No Phone', '50', '2020-05-20 12:00:00', 2, 'hours', 'Daily', 7, 2);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (6, 'Health and Food', '2020-12-01 12:00:00', 'Eat fruits', '50', '2020-05-15 12:00:00', 1, 'piece', 'Weekly', 2, 2);
insert into goal (id, category, end_date, name, progress, start_Date, target, unit, repetition, award_id, user_id) values (7, 'Health and Food', '2020-12-01 12:00:00', 'Drink Water', '50', '2020-06-01 12:00:00', 3, 'liter', 'Daily', 3, 2);