CREATE TABLE departments(
    id SERIAL NOT NULL,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    CONSTRAINT PK_departments PRIMARY KEY (id)
);

CREATE TABLE instructors(
    id SERIAL NOT NULL,
    department_id INT NOT NULL,
    headed_by VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    CONSTRAINT PK_instructors PRIMARY KEY (id),
    CONSTRAINT FK_instructors_department_id FOREIGN KEY (department_id) REFERENCES departments (id)
);

CREATE TABLE students(
    id SERIAL NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    CONSTRAINT PK_students PRIMARY KEY (id)
);
CREATE TABLE courses(
    id SERIAL NOT NULL,
    department_id INT NOT NULL,
    instructor_id INT NOT NULL,
    duration  INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT PK_courses PRIMARY KEY (id),
    CONSTRAINT FK_courses_department_id FOREIGN KEY (department_id) REFERENCES departments (id),
    CONSTRAINT FK_courses_instructor_id FOREIGN KEY (instructor_id) REFERENCES instructors (id)
);

CREATE TABLE courses_vs_students(
    course_id INT NOT NULL,
    student_id INT NOT NULL,
    CONSTRAINT PK_courses_vs_students PRIMARY KEY (course_id, student_id),
    CONSTRAINT FK_courses_vs_students_course_id FOREIGN KEY (course_id) REFERENCES courses (id),
    CONSTRAINT FK_courses_vs_students_student_id FOREIGN KEY (student_id) REFERENCES students (id)
);
