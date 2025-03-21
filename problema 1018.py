n100=0
n50=0
n20=0
n10=0
n5=0
n2=0
n1=0
a = input("")
inta = int(a)
while True:
    if inta>=100 :
        inta-=100
        n100+=1
        continue
    if inta>=50:
        inta-=50
        n50+=1
        continue
    if inta>=20:
        inta-=20
        n50+=1
        continue
    if inta>=10:
        inta-=10
        n10+=1
        continue
    if inta>=5:
        inta-=5
        n5+=1
        continue
    if inta>=2:
        inta-=2
        n2+=1
        continue
    if inta>=1:
        inta-=1
        n1+=1
        continue
    if inta==0:
        break
print(a)
print(f'{n100} nota(s) de R$ 100,00')
print(f'{n50} nota(s) de R$ 50,00')
print(f'{n20} nota(s) de R$ 20,00')
print(f'{n10} nota(s) de R$ 10,00')
print(f'{n5} nota(s) de R$ 5,00')
print(f'{n2} nota(s) de R$ 2,00')
print(f'{n1} nota(s) de R$ 1,00')
