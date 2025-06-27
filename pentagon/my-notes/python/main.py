import random
#snake water gun  or rock paper scesor
def game(comp, b):
    if comp == b:
        return None
    elif comp == 's':
        if b == 'w':
            return False
        elif b == 'g':
            return True
    elif comp == 'w':
        if b == 's':
            return True
        elif b == 'g':
            return False
    elif comp == 'g':
        if b == 's':
            return False
        elif b == 'w':
            return True

# Computer's turn
print("Computer's turn: Snake(s), Water(w), or Gun(g)...")
randNO = random.randint(1, 3)
if randNO == 1:
    comp = 's'
elif randNO == 2:
    comp = 'w'
elif randNO == 3:
    comp = 'g'

# Player's turn
b = input("Player's turn: Snake(s), Water(w), or Gun(g): ").lower()

# Check the game result
result = game(comp, b)

# Show the choices
print(f"Computer chose: {comp}")
print(f"Player chose: {b}")

# Print the result
if result is None:
    print("The game is a tie!")
elif result:
    print("You win!")
else:
    print("You lose!")
