def value_of_card(card) : 
    """Determine the scoring value of a card.

    :param card: str - given card.
    :return: int - value of a given card.  See below for values.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1
    3.  '2' - '10' = numerical value.
    """
    if card  == "A" : 
        return 1
    elif card == "J" or card == "Q" or card == "K" : 
        return 10
    else :
        return int(card) 
pass 
def higher_card(card_one, card_two):
    """Determine which card has a higher value in the hand.

    :param card_one, card_two: str - cards dealt in hand.  See below for values.
    :return: str or tuple - resulting Tuple contains both cards if they are of equal value.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1
    3.  '2' - '10' = numerical value.
    """
    ten_value = ["J", "Q", "K"]
    if card_one in ten_value and card_two == "A":
        return card_one 
    elif card_two in ten_value and card_one == "A":
        return card_two
    elif card_one in ten_value and card_two in ten_value:
        return (card_one, card_two)
    elif card_one in ten_value and isinstance(card_two, str):
        return (card_one, card_two)
    elif card_two in ten_value and isinstance(card_one, str):   
        return (card_one, card_two)
    elif card_one == "A" and isinstance(card_two, str):
        return  card_two
    elif card_two == "A" and isinstance(card_one, str):
        return card_one
    elif card_one == "A" and card_two == "A":
        return (card_one,card_two)
    elif isinstance(card_one, str) and isinstance(card_two, str):
        if card_one > card_two:
            return card_one
        elif card_one < card_two:
            return card_two
        else:
            return card_one
    else:
        return None
