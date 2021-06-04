--DROP TABLE hours_slept IF EXISTS;
--DROP TABLE 

CREATE TABLE wellhours (

  input_id serial,
  hours_slept double NOT NULL, 
  hours_slept double NOT NULL,          -- Name of the park
  location varchar(50) NOT NULL,      -- State name(s) where park is located
  establish_date date NOT NULL,       -- Date park was established
  area integer NOT NULL,              -- Area in acres
  visitors integer NOT NULL,          -- Latest recorded number of annual visitors
  description varchar(500) NOT NULL,  --
  
  CONSTRAINT input_id PRIMARY KEY (input_id)
  
);