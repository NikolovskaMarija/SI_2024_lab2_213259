# Втора лабораториска вежба по Софтверско инженерство
# Марија Николовска, бр. на индекс 213259
# Control Flow Graph
![Control Flow Graph](https://github.com/NikolovskaMarija/SI_2024_lab2_213259/assets/165567931/f05a000e-7a08-4eae-89e6-d9278491be05)
# Цикломатската комплексност
Е:број на рабови N:број на јазли E= 36  N=28 C=E-N+2= 36-28+2= 10
# Every Branch 
1. allItems го иницијализираме на null -Оваа линија ни објаснува дека листата е празна, и дека фрламе исклучок
2. allitems го сетираме да е различно од null name го иницијализираме како "milk" barcode го сетираме како "02468" discount да ни е поголемо од 0 price да ни е поголемо од 300 payment да ни е поголемо од sum - Со оваа линија ги исполнуваме сите услови односно TRUE
3. allitemsго сетираме да е различно од null name го иницијализираме на null barcode го сетираме како "0-1246" - Оваа линија ни кажува дека овој условот за barcode не е исполнет бидејќи во кодот имаме  (allowed.indexOf(c) == -1) што значи фрламе исклучок
4. allitemsсетираме да е различно од null name го иницијализираме на null barcode го сетираме како "02468" discount го сетираме како 0 payment да ни е помало од  sum -Во кодот имаме  (item.getDiscount() > 0) (sum <= payment) што значи првиот услов поминува но вториот услов не поминува што значи целосниот услов не е исполнет
5. allitems сетираме да е различно од null name го иницијализираме на null barcode го иницијализираме на null -Го имаме кодот (item.getBarcode() != null) што значи условот не е исполнет и фрламе исклучок.
# Multiple Condition
![image](https://github.com/NikolovskaMarija/SI_2024_lab2_213259/assets/165567931/923782cc-11e5-40f4-abca-f10367982449)


