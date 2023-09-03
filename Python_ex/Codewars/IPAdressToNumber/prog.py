def ip_to_bin(ipAdress):
    return int(''.join(f'{int(i):08b}' for i in ipAdress.split('.')), 2)


def bit_to_ip(intip):
    return '.'.join(str(int(f'{intip:08b}'.zfill(32)[i:i+8], 2))
                    for i in range(0, len(f'{intip:08b}'), 8))


print(ip_to_bin('10.0.0.0'))
print(bit_to_ip(167772160))
print(f'{167772160:b}')
