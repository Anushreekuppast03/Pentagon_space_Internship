import sqlite3
conn = sqlite3.connect("sqlite.db")

ins='''
insert into student(st_id,st_name,st_class,st_email) values
(6,'jAnu','10th','bkanushree03@gmail.com')
'''
conn.execute(ins)
conn.commit()
conn.close()