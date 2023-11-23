# 9506번
import sys

while True:
    index = 1
    n = int(sys.stdin.readline())
    n_list = []
    if n == -1:
        break
    while index < n:
        if n % index == 0:
            n_list.append(index)
            #print(n_list)
        index += 1

    if sum(n_list) == n:
        print(str(n) + " = " + ' + '.join(map(str,n_list)))
    else:
        print(str(n) + " is NOT perfect.")