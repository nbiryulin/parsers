# TSV parsers compairing
This ugly stupid code is for finding out the most fastest TSV parser by splitting file to String[].

I chose this parsers as how i find in google they are faster than others:
* Fasterxml
* Flatpack
* OpenCSV
* Univocity
* SuperCSV

But I didn't understand how to split TSV correctly with Flatpack so I deleted it.

The output after 10 test with 100 000 lines file with average time :

    1674 1169 831 854 827 846 811 801 807 809 Average: 942 Univocity parser 
    1441 1169 1148 1142 1120 1125 1143 1121 1131 1138 Average: 1167 OpenCSV parser 
    1233 924 859 864 849 851 870 862 862 863 Average: 903 Fasternxml parser 
    1104 1154 1015 1015 1010 1027 1013 1012 1019 1012 Average: 1038 Super csv parser 

Suppose that it wasn't useful for u 
