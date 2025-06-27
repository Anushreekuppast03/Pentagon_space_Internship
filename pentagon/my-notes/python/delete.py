import sqlite3
conn = sqlite3.connect("sqlite.db")
st_id=input("Enter th student id")
conn.execute("DELETE FROM student where st_id="+st_id)
conn.commit()
conn.close()