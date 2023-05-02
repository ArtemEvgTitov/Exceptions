def devide(a, b):
    if b == 0:
        raise RuntimeError("Нельзя делить на ноль")
    return a / b


devide(9, 0)
