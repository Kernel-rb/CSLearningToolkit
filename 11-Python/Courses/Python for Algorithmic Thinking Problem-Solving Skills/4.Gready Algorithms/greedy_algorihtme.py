def make_change(target_amout):
    demonation = [200,100,50,20,10,5,2,1]
    coin_count = 0
    values = []
    for coin in demonation : 
        while target_amout >= coin:
            target_amout -= coin
            values.append(coin)
            coin_count += 1
    return coin_count , values




print(make_change(24))
print(make_change(163))
