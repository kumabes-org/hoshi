INSERT INTO departments(name, location) VALUES('Tecnologia da Informação', 'São Bernardo do Campo');
INSERT INTO departments(name, location) VALUES('Recursos Humanos', 'Suzano');
INSERT INTO departments(name, location) VALUES('Contabilidade', 'Mogi das Cruzes');
INSERT INTO departments(name, location) VALUES('Marketing', 'São Paulo');
INSERT INTO departments(name, location) VALUES('Manutenção', 'Santo André');

INSERT INTO instructors(department_id, headed_by, first_name, last_name, phone) VALUES(1, 'Hebe Camargo', 'Fausto', 'Silva', '(11) 99999-9999');
INSERT INTO instructors(department_id, headed_by, first_name, last_name, phone) VALUES(4, 'Hebe Camargo', 'Xuxa', 'Meneghel', '(11) 99999-5555');

INSERT INTO courses(DEPARTMENT_ID ,INSTRUCTOR_ID ,DURATION ,NAME) VALUES(1,1,40,'Lógica de Programação');
INSERT INTO courses(DEPARTMENT_ID ,INSTRUCTOR_ID ,DURATION ,NAME) VALUES(4,2,40,'Gestão de mercados e estratégias de marketing');

INSERT INTO students(first_name, last_name, phone) VALUES('Gugu', 'Liberato', '(11) 99999-8888');
INSERT INTO students(first_name, last_name, phone) VALUES('Renato', 'Aragão', '(11) 99999-7777');
INSERT INTO students(first_name, last_name, phone) VALUES('Silvio', 'Santos', '(11) 99999-6666');

INSERT INTO courses_vs_students(course_id, student_id) VALUES(1, 1);
INSERT INTO courses_vs_students(course_id, student_id) VALUES(1, 2);
INSERT INTO courses_vs_students(course_id, student_id) VALUES(2, 3);