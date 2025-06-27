class Remote:
    def isLeftPressed(self):
        return True
class Player:
    def moveRight(self):
        pass
    def moveleft(self):
        pass
    def moveTop(self):
        pass
remote1 = Remote()
player1= Player()

if remote1.isLeftPressed():
    player1.moveLeft()
