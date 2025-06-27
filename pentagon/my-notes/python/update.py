import sqlite3
conn=sqlite3.connect("sqlite.db")
conn.execute('''
           update student set st_name="tanu" ,st_class='9th' ,st_email='tanu09@gmail.com' where st_id=6
               ''')
conn.commit()
conn.close()