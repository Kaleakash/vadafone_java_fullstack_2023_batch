import { useState } from "react";
import './App.css';
function ProductOperation() {

let [b1,setButton]=useState("Add Product");     // to change button value;

let [pid,setPId]=useState(0);           // 1st forms 
let [pname,setPName]=useState("");
let [price,setPrice]=useState(0.0);
let [url,setUrl]=useState("");

let [product,setProduct]=useState({pid:0,pname:"",price:0.0,url:""});   //2nd forms 

let [products,setProducts]=useState([
    {pid:1,pname:"TV",price:56000,url:"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxQUExYTFBQTFhYWGBYYFhYYGBYXGBcWFhYXGBYWFhYZHikhGRsmHhYWIjIiJiosLy8vGCA1OjUuOSkuLywBCgoKDg0OGBAQGy4gHh4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4uLi4sLi4uLi4uLv/AABEIALYBFQMBIgACEQEDEQH/xAAbAAABBQEBAAAAAAAAAAAAAAAEAAIDBQYBB//EAEsQAAEDAgAIBg0JCAMAAwAAAAEAAgMEEQUGEiExQVGRE1JhcYHSFBYiMkJUkpOUobGz0QcIFUNTYnOywSMzNERygqLhY/DxZHSD/8QAGgEAAwEBAQEAAAAAAAAAAAAAAAECBAMFBv/EADIRAAIBAgQDBwMDBQEAAAAAAAABAgMREhMxUQQhQSIycYGRobFhwdEU4fAFI0Ky8aL/2gAMAwEAAhEDEQA/ACqzC1QJJAJ5rB77DhZM3dHMM+hQDClR4zUedk6yirB+1k/Ef+YrjXhb6dODinYxznJSfMnGE6nxio87J1k8YRqPGajz0nxUTSNinjZdXlw2RGZPcQrqjxmo89J8V3suo8ZqPPSfFOazkTwxGXT2Qsye5Aaqfxmq89J8UuyJ/Gavz8vxRBhCYadGXT2QZk9yHhJ/Gqz0iX4pruH8brPSJfipxEVIYyjLp7IM2e5Xkz+N1vpMvxUT3z+OVvpM3WVjwCY+m5EZdPZCzZ7lVep8crvSZusmXqL2NZXelTdZWElhmUchuOVJ0YbFxrSvzYMYp/Ha/wBKn6yd2PUWv2bX+lT9ZNE7hmtdLszVYhY6lNo9ajKnJaIic2o8dr/Sp+smWqPHa/0qfrIy/KFOACNSyyxx56o2Rp0ZdmyTBRBOf53CHpM/WUEsdSP5yv8ASp+srUMsnZta003GSuY61LA7WM/I+pH85X+lT9ZDSVVUP52u9Jn6y0j6cHQhZ8H8i74IroZtTOvwjVj+crfSZ+uonYWq/HK30mfrq1noUDLSKbQ2KwMCdhqs8crfSZ+uozh6s8crfSZ+upZKdDSU6dobEuEh5xgrPHK30mfrpnbDWeOVnpM/XUD4lC5irDDYhqQb2w1njlZ6TP1004x1njlZ6TP10EWqNyeXHYTbDjjJW+OVnpM/XXDjNW+OVnpM/XVc5RlNU47HOU2WZxnrfHKz0mfrrnbRW+OVnpE/XVUU1GXDYWOW5778g+Epp4KgzTSylsrA0ySPeQDGDYFxNhdJC/N4/h6r8ZnumpLFLVmpaIrp4XGSUgXHCSfmK4IHcVWVMy7pPxZPzFFAcy305dlGGfeZSCkPKnCkfqurwOGsKUSMVYiLFCWyt5URBKTpFirhpZtCfwbDsRiHYrwxdDRrVgKduop4pxrsljQYSrNONRsmuiPIrYwtCjdk7QjELCVRadaikGwq3Lm8igeG7FVxWM1VQuKFLC3QVr3RsI0BBmjjJ0BO4JGabV2FiM6H7Pz2LQR/3WtUcDMOchNdghnF6VylI00kZ0PD/BIXIpSw6LhX30WAc1wmOwVrXHk9DXdrVkEbhIMxz7FD2O4HWmVVDIDZt+cJsTagaTccqxVKLpu8H5HpUuIzI2mvNfj8BMbTtRDZLaVHFUDwm25Qj+xGuFwQnGrVTs0E6NFq6ZXTAHRZV89PdXM1CRoQc8bthWiNaL1M0uHku7zKKalshJIVczMPFQM0J2FWrPQ5O8dSrkhCFkhVlLGdhQkgVWaIckyvkjQ7wjJkJIF0Rwm0DuUTlM4KJwXRKxnbGJhTymlDEe5fN5/h6r8ZnumpJfN5/h6r8ZnumpLz5as2R0Qynf3Uo/5ZfzFEGdo0uA9ayGGcOOhmlaGm3CSG+rO48iBjxnb4QceYrZBPCjHPvM3k1RERncegFV0kbCLtfJ0qipsPwO75hH9yK+koHaD61ehIazNxnct0dDSZQ7l5B2XP6qnjlbqcN5XY3vvpB2EORdiNBFg6X7VvSVOyJ40zx+s+xUTxPa+e3/diHHKbHpKVwsjUAnXLHuKnZCDokYeYErJwREnuXt5s+dXlHgeY58pnNb4JNpDRZDB9/Db5JT3YJdqczcUA+jqWHU4cnw0qxpZHZrgetJt9GCS2BZMFyasg9NlE6geNIb0G6uXuadLT61Xz07XnvX26UYmOw6mdHocbFFhsWpzfUg2YPGpqmhoSDmGbWstWk5PlJo3UuJUVZwQ+SjYdBb6lE/Bmwo8QfdTJqd2pg3rjk1OkjSuMpdYFU7BB1ErowU7Wb86Nc97dMT+cFpHqSdhANHdXHJf4hLKq7plfq6OzRVz4JvsQD8GuboIV4cMxaMoJklXG4a/0SdKrfup+ZceLo6YmvIo25Q1+tP7J42dPrQw96W77qirhINAuOQqo0anVe5T4ujblL2sXDqiPWAq+qhjOgqglrJBtUHZztq2QptGCrXUtC4dA3/1V01IwqFsznZhpUE4kGorurGR3FPSNVfNRrskzlC+cp2JuyCWnQ74kS6ZRuenYlyAnMTCEU6yjICQXPavm8/w9V+Mz3TUk75vP8PVfjM901cXny1ZtjoiCLAQn4VxP10otmtmeUPJiNHxR0ErHYx17o6mYNkcw5b9BI8I7Ch6HGiqjFm1DrG2mzt2VoXeNKdk0zhKpC7TibUYhM226T8Ex/wAn3FkHTf4Kkj+UOpDckmInjZFjuztO5WNB8oco79scgz2yTkEZ75znFhzatKrDWROKm2SH5PptT2lPbiXVs70g9KvsD44xzZVw6Mi1ge7yr8XIF1aQ4aDnBgElyCQS1zW5ja13CwPIubqzTs0UoRaujLtwPhBmbIY4coHwUE1LXjP2Ow8mQCt12Y/Wx/OLO9hCCqnEkftZm+U23RY3QqwstGFlpqw5zTG+0BwPqKUNdXxfV1Nv6SfaCtycHSPziof0kg+wJ/0PMRk9kc2dpKrOX8uTlmPbjhVM75sw54/bmTm/KBJlDLAtr7ix9a1EmCKgEXnadg4Mn1i4B51BNgOqdnyoX7AW29rU1Uh9AwSOUWOlO/S5oPLcforKLGKmdodGTyOCzddgqfw6SF4HF/8Acyq56YNJyqAAc7huN0dlh2j0mlrIn96W70c2MLxoSsabtp3MOoh7z6ithgvCM5jaeBlI2g6RtACxcZWdBJ3XPdpfJv4WjGrre/gzchifk8i8/qMZJgbOhnFuX4hDuxyt4U7TytjcFyhxE5f4vywy/wBZN+x1lwiXVLxuvlHorrawVBNTxOzFrTzhYOPHp4HftcfvRuH5XWXG49zOIAjY47AT7Fsipvn8pr5Mk4KPL7p/BrpMBRHvLA8nwKgdgJ9rZQdz2HsWffj0W9/AL7M4P5QmyfKE22aA3/rAVLMObjEsK3F2Um4ZEeaw9qC7XHi5dE633Df2IU/KC497Dvmt6rELrceagmzadjuXhB7bBX20RaIqvBkANnxVLb6+De4eoFU9bgKE545m34rmua7m0aVaVOOVcczKVgO03d7CEw4Zwq/Q2Jo1kRXtzhwPqVJyWrXqJpbMys2A5m52td0adyhbVvZmcCduUFsGsws89/B/dDb2RqCowLhB/wC9dBbaIrn/ACYFWaurXqLA9jJVFRG/wQCgJYRqAK9F7U6a3dz3druMnPyNZo5rlVdXitT+DUMH9TX29YRmxDA0YJ8Y5fUo57LVvxav3k9O7+7J9oQNbi5My+Zp/pe0+q91WKO4rMzB5L7kxwVnLRSN0scOcFByMI0hVcho9m+bz+4qvxme6akl83z9xVfjM901JefPvM3R0R5bjkL1c39bvzuVKArTHWW1ZN/W/wDO5UYnXpUu4vAyTi3JhrQpIwNaA7IK6KpdDk6cjRUdWGA5LnA6rXGfn1LWSVM8TO4whG5vF4V97kXsA4G55ivNW1SeKpcalHHbn7J/J0hKUE01fza+D0B1XXPjL2yF7RcktezKFs5uMzsyAixmq2EESy5vvZSycdVsPrRrXykXDXW22PQmqSWtvS33/AnJy7qd/G/2Nq35RKi1nRMcdpabnnF7Jvbzfv6dpI8KwH5gfasTw7xcG3KDdIVnKzozetL9PT2+RZk/+2PQW/KCQLNDGjULDN0tGZDuxzmcc8pHMQfasI6radIF+QqwwVWxNdlPYHt1tJt6wplw8Yq6jf0KhUcpWk7LfmX8mM050TyDpPxQ7sJzP0z353W/VBVuGopDYsDWgWaG+ChWSMvm0JRg8PONn6neSgnykpLzRcwwzOJztdbTZzfit/i/SS8A3wbayO5O5Y3F7CVNEQ50XCOvmBcMkdGvpW4p8cpHZhwDW2GTctI5B3AJG5fOf1qFWusDg1GLveyd+W2NS67Pwsrnr8G1Bdizb15/syV00jRZz4XchLm+tzR7VQ4WwxkZwxpOsBzD7b3V3LWvmB4Qxhp0HuwHcxdbNnVFWYvUztEpaTta4g8x1rwuA4OhmXrR5LZPn5J3+X4HoOtNQ7K5/wA+lvYy2EMM5ffQsHLYA7xZAxYSDTcNWgwhiq5rS9r8of2C4Gnwz7Fl5o7bF9vwc+HqQtRd0vb1PA4vNvep18A8Ya5PYU5mFmnSxp6LKleFC4rcqaPPdR7mtZXUpGeAA7Q4n1ZlPTtpHcVnKXSj8t1iS8rglKnJ2bJz11RvJcHRWu2pZzCR99zmKnmwi9hsyaXNoz3WdFS7au9kuRGjJau4OtHaxo2Y01LfrSef/wAUnbjUHS7pFx7FljIdqnpYJJDYWHKTYDpQ6UUrtIUajk7RuzVw42zAd888znH1FclxreT3QDh95rSeg2FlVtoI2ECSpbzRscQOcuyfUCmSuizgBzuXKHst+qzrBLRP0a+UjZlzS7TS8037XLduMMBFnU7STru79NCGmr4DfJiLf7iVRyhoFw7o07zqQbpTt9a6Kinp9zjKrbUt5JxfM5w5ihagl2mR/ShW1O0BP7LACbjLYcZQfU9Z+QQWirB/zs901JL5A33irDtmZ7pqSxy1dzSldcjzDGWMGpmNvrJNQ47uRVwp+QeSPgj8ZZD2TOP+ST87kAwnlXoUopwXgYKkrTY8Up2N8kfBPbRnijyQnMJ5VPFzK7EqTI2Ug4rfJapewwNLW+S1WdFSZd7McTm0LXSUc8jO5pI2gjTkAG9rXBJzHmXGpPC9Psd6cMV7uxgW0YtfJb5LUuwRxWeS1bZ2DqtsZYI7NNwQ1rbm+Y59KAjxaqXEDg3eoIU09bBKLVrXM52CNOTF/ikKJvFi/wAfgt43EOTJBL2A7LnN6lwYkjwpG32AfGynOp7hgmYJ9IzZH/iicH0EL3BruDYNbiAfYFuO0XZkn/vIhH4oyNOeO/N/tDqwasnYqMZRabV/UzFbgaNhz5BaRdpAGcbkGyliv3rdw+C0k+L8uqF5QTqGRmmK3OERfLW/sVJpvkrFlivgSnlNiWNdfMC1ljo1lbRmJlvqacjVdsf6BYLB9S9ru9aNHgj4L0TBdW4xDNcHVqHqXzf9YjOE1OTbi9Emlb/y/wBvr09rhJXp/wBu11rde+oHNi82PO+Cntq7kG3+KpKuWkb9Q1x5LAbslaySMuz5DBzkn1E2WfwtgjK73IB2hoHwWHga8My07pP6v9n8GuUJSjytf+ePyZ/CWE4nsyBA0DVcRuA6MhZ8wRcQDoaPYrbCGC3M757d4vuCBZSEnMQvquFhShD+3o/H7nh8U6mLt6gUlPHxG7goHU7OK3cFc/RpTm4N2kLWmjG0ygdTN4rdwTBSDijctazBkQGeViJpqamb3xa7kuf0CWYthYHuYo0I4oUZoOQLeTz09rNhHPd5VLNSZR7lr+TMnGd+hDhbqZw0g2BPhYWnOARsN7epaBmBJnfVuUhxemGlirHF62BRkndMr2xU7tMT4+Rrw5p6CAQoJsFR2zObbYcr4WV9DgGS2j2n9Fx+L8mix59HtXBYU+Tfrf5NDm5LnFelvgyb6BmoZ9oQ76Lk9q3UeLea5kYOS+dDzYKYPDYeYroqkfE5OEmYwYN25t6c7BebT7VoJYWgoeV7W7dyd2CSWp6H8gEeTDVjZOz3TV1SfIU67K0/87PdNSWGWrNK0MDWYKkmnncyJz/2sucNJ0POsIigxQqXi4isM3fdzuur/B2MAgEzTqqKg3uNch1J7seWf9C7wnUskkcpRhe7ZAzECXJuTHfZc+2yOocRD9Y9o2Bovr1oYY9ji+r/AGuPx9OpgTeaLsGowZi1FDe3dXt31s1tllYR0QBuL5tGfNuWCOPMx0NaujG6odotuUOlJ6jzEj0AwnWSg53EEdw87ysmMMVbh37W7kNNX1RzcM0dKFSYnURtH4Se36p24rjsLvAvwfqCwMtdU6OHPQST7FyGGrk8OW3Pb2qslCzDcvw1J9mBy3UU2H5R4LByk/7WWGL9S7S6Q/3f7SGKUuUMo5v6roVOIsbLaswvKdM0bb7FUzzZRN6hqvKTFmIabHnuUazAcI1M3JrCtAVzFxwXPcyZXMCtxguCURNblkdCLpKWJmgN3KwbMORYuLo5yStp9DfwtdUilnoJSc8js/Ig6jF9ztchPQFqhLzJ3CrjT4XBzXLwsvhGifHNq35/JiBie52rPylNZibK03BaFtzINqjkqGDSR0lbYuSRgnNSd/sZbtOcdMgCZLiTmzSDctFJhiMaLHmQ7sO7G71ScyG0Z52JTtT2noKa3FGoBzGPcrSqxkeM1moQ4zOOlwbzBX2yOQHUYt1bc7TEeSzR7QuCjr2WtG0jXbg7+zMpKrDgvczv5hmVTWYxgZmmQnaXn2JpSYm0W7MJ1rO+p7/3MHsCHqMZKkd9AWjXnBWYnxilOYOKEdJJJnLj0qlSWrSFjZvu2Gntcl4zZwTZVlZh+mPgyO/uWRlZk6XIOSYJqlEMbNG/DsQ0Rb3FA1mH73yWMbzBUD5eVRzOXTAibsMlwrIde5DT1r3aSUEZOVRukVWRLZ7T8gB/Y1f47PdNXVH830/sKr8ZnumpLzZ95m2OiMXU4MMks7gT+/mFuaRyjZgVvhFyuqE91P8A/YqPeFFmx0gblsh3UZZ95lLBgyJukuPQpzTxDQEfNwYGdt+a6CkmAFgx6skYwjU0bl2Nz/8AQCja7nHIio6zJ71pvzIA6+SW1s9lDwm0IuPCD9GQOlTCdx+rZ60CK+Gcg5mjnVzR4XkGbJahw7bG3eVI2qA8BvQSiwrhLsITuOwI2ne7WfaqwYRt4I3qQ4YPFbvSsFy3fIB4XtQUlaGnviq+TCr9WT7VC+vcdOT0BFhlwzCP3kRDhE30qopnR6SEa2WIags1SpbRNm6lw6kruSLVtZ95MlrnaiFVvr2DUFE/Cg2DcuWbLpE7fpYL/ItHVDz9ZbkATZIsod0Sd6pjhnYnDDBRjqbD/T0tywNA3m6VHJG0DvlWS4W5kHJhInUnjqDyKWzCqxzRoAKpaud2qwRJlumFm1WpyE6FPovcppssqAxlXroW7UHM9oWiMjLOmkVzbjOmy1DtpRbpAhJJWrocGCSOJUDwUVJM1DyThNMkhIKjcuyTKB8qZNh7ioi5RuemkpiPcPm+fuKr8ZnumpLnzef4eq/GZ7pqS8yfeZujojNU0tnzj/5FR70ovheVZ+aYiacA/wAxP71yXZB2rbTXZRln3maFrwdd04FvIs4Kkpzah3KrsQaPhG8m5d4dvIs6XvOs71NFm0m6LAXvZQ1WS7IHIqoTJvCp2BluZmqMvGxVZqU11QUWEWZc1RukbtVfwhUMj07AWplaNaHNW2+kKmlnIUDpSdCTGaEYSboK4cJN2qgDTbOUwRnaubR2gy+OEAdq4cIhUmVbWk25K52R35lhNWu1JraiQ6kxjskJvZJK5ylfRGiEMK7TDWNvpcieHaBmAVSJinh10lCQ3Uh0QbJW7ENLUu2oaR6GkmXRQXU5Oq+hO+c7UM+flUMk6hdKrSsc229SZ8xQ7npjpFE6RUmc7Ic9yGe5de9QucqRzkjpcmEpOcmkqrnM7dMJSLk0lJsqx7r83n+Hqvxme6aku/N3/hqn8ZnumpLBLVmtaI88rH/t6gf/ACJ/euTA4bUFheuDamoF2/v59f8AyuQ30mNrfKC1QqxUUmZ5U5Ntl01w2qVsqoBhMbW+UF36TG1vlBVnQ3JypGgEvKlwqoRhQbW+Uu/Sw+75SM6AZUi+4dM7IVF9LD7vlBOGEic4A57ozoCyZF3wyRmVAcMAa2+UEjhkbWeUEZ0AyZF6ZymmdUZwyPueUFz6Xb9zygjOhuGVMuHuBzpjn5lU/Sw2s8oJDCPNvQ60NxqlIshddyVX/SXIN679I8g3rjKomaYRSLC/IpQ8BBUcgkyryQx2tbhHluVc6rA6LXPQpXMAF+yKfQTYPcTmuck2aRlZtAOkgXUOVzspRXMJMqWWFUjCHIN6a6uPJvVRlFHOUm2WjpgFG+rVY6qvs3qN9SBpIHOVeZE5WYdJUqB8yENU3jN8oJhnZxm7wjMgPtBJkUbplCZWccbwuZbOON4RmQJakPdKmGUrrGtOg35iCmvDRmLgOchPNgThkcumEp12ccbwldnHG8J5sBZchl0wlS9xxxvaudxxxvCWbEMuRGuFS2ZxxvCWSzjjeEZsR4Ge5fN3/h6n8Vnuwku/N5t2PU2Nxwzc/wD+YSWWT5s7Hq3BN4o3BLgm8UbgpEkhkfBN4o3BLgm8UbgpEkAR8E3ijcEuCbxRuCkSQAzgm8UbgvKMfcRo56uSbKLeEDLgNFszA39F60qHD0F3A8lvWUAH4IjHAxXAJ4NlzYZyGi6L4JvFG4KswfXMZG1riQRcaCdebQifpaLjHyXfBABXBN4o3BLgm8UbghPpeLjHyXfBL6Xi4x8l3wQAUYWnNkt3BVpxbpT9S3e74qc4ah4x8l3wTThyHjO8h/wQAO7FSkP1Ld7vimHFGj+wbvf8UScPwcZ3kP8Agm9sMHGd5D/ggAftOovF2b3/ABXO0yi8XZvf1kQcY6fju8h/wXO2Wn47vIf8EAD9plD4uze/rJdpVD4uze/rKftopuO7zcnVXO2mm47vNydVAEHaTQ+LM3v6yMwVi/TwFxhhawusHaTcC9tJO0qLtppuO7zcnVTTjXS/aO83J1UAXHBN4o3Bd4JvFG4KlON1L9o7zcnVTTjjSfaO83J1UAXnBN4o3Bc4JvFG4KjOOdJ9o7zcvVXO3Wj+1d5uXqoA81+W+jE1VAy9hHCTmGuR5vfojG9eg/JtgtsGDqeOwPclxJAveR7n5/KXnmOFY2pqXysvkWa1lxY2aNNtWe5XsWCoODhiZxI2N8loCACOCbxRuCXBN4o3BPSQAzgm8UbglwTeKNwT0kAR8E3ijcEuCbxRuCkSQAxsYGoJJ6SAEkkkgBJJJIASSSSAEgMJ0b5A3IkDCCbksD7g6rEi2gZ0kkABfQ83jDfNDrLn0LN4w3zQ6ySSAOHAcv27fNDrLhwDL9u3zI6ySSAGnF+X7dvmR1lw4uyfbt8yOskkgBpxbk+3b5kdZc7WZPGG+Zb1kkkAcOLEnjDfMt6yacVZPGG+ZHWSSQBw4pv+3b5kddNOKL/GG+ZHXXEkAcOJ7/GG+ZHXTTia/wAYb5kdddSQA04lO8Yb5kddNOJDvGG+ZHXXEkALtFP27fMjrpvaIft2+ZHXSSQAhiHnF5wRcXHBAXGsXysy2qSSAEkkkgBJJJIASSSSAEkkkgD/2Q=="},
    {pid:2,pname:"Computer",price:4200,url:"data:image/png;base64,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"}
])
let storeProduct=function(event){       //adding data through 1st form 
    event.preventDefault();
    //console.log(pid+" "+pname+" "+price+" "+url);
    let productData = {"pid":pid,"pname":pname,"price":price,"url":url};    // convert all individal property to object
    //console.log(productData);
    let result = products.find(p=>p.pid==pid);
    if(result==undefined){
    setProducts((previousProduct)=> {
        return [...previousProduct,productData];
    })}else {
        alert("Pid must be unique");
    }
}
let addProduct = function(event){           // adding data through 2nd form 
    event.preventDefault();
   // console.log(product);
   if(b1=="Add Product"){
    
    let result = products.find(p=>p.pid==product.pid);
    if(result==undefined){
    setProducts((previousProduct)=> {
     return [...previousProduct,product];
    })
    }else {
     alert("Pid must be unique");
    }

   }else {
        //alert("We will do update operation")
    let tempProducts = [...products];   // store all product in tempProducts;
    let index = tempProducts.findIndex(p=>p.pid==product.pid); // search product index number
    // 1st paramteter index position and 2nd number of record to delete, and add new product in that location. 
    tempProducts.splice(index,1,product);   // move that index position the remove 1 product 
    setProducts(tempProducts);      // then tempProducts add in setProducts function 
    setButton("Add Product");
   }
   setProduct({pid:0,pname:"",price:0.0,url:""});   //reset the value 


}
let deleteProduct=function(event,pid){
    //console.log(pid);
    let tempProducts = [...products];   // store all product in tempProducts;
    let index = tempProducts.findIndex(p=>p.pid==pid); // search product index number
    // 1st paramteter index position and 2nd number of record to delete 
    tempProducts.splice(index,1);   // move that index position the remove 1 product 
    setProducts(tempProducts);      // then tempProducts add in setProducts function 

}
let updateProduct= function(event,product){
    console.log(product);
    setProduct(product);    // to display product details in text field we bind with value attribute 
    setButton("Update Product");
}
let resetFun= (event)=> {
    setProduct({pid:0,pname:"",price:0.0,url:""});
    setButton("Add Product");
}
    let productRecord = products.map(p=>
    <tr>
        <td>{p.pid}</td> 
        <td>{p.pname}</td> 
        <td>{p.price}</td>
        <td><img src={p.url} width="80px" height="80px"/></td>  
        <td>
            <input type="button" value="Delete Product" 
            onClick={(event)=> {
                deleteProduct(event,p.pid);}}
             className="btn btn-danger"/>
        </td> 
        <td>
        <input type="button" value="Update Product" 
            onClick={(event)=> {
                updateProduct(event,p);}}
             className="btn btn-info"/>
        </td> 
    </tr>)
    return(
        <div className="container">
            <h2 className="myClass">Add Product 1st </h2>
        <form onSubmit={storeProduct} className="form-group">
            <label>PId</label>
            <input type="number" className="form-control" name="pid" onChange={(event)=>setPId(event.target.value)}/><br/>
            <label>PName</label>
            <input type="text" className="form-control" name="pname" onChange={(event)=>setPName(event.target.value)}/><br/>
            <label>Price</label>
            <input type="decimal" className="form-control" name="price" onChange={(event)=>setPrice(event.target.value)}/><br/>
            <label>URL</label>
            <input type="url" className="form-control" name="url" onChange={(event)=>setUrl(event.target.value)}/><br/>
            <input type="submit" value="Add Product" className="btn btn-success"/>
            <input type="reset" value="reset" className="btn btn-info"/>
        </form>    
        <hr/>
        <h2>Add Product 2nd </h2>
        <form onSubmit={addProduct} className="form-group">
            <label>PId</label>
            <input type="number" className="form-control" name="product.pid" value={product.pid} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,pid:event.target.value}
            })
            }/><br/>
            <label>PName</label>
            <input type="text" className="form-control" name="product.pname"  value={product.pname} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,pname:event.target.value}
            })
            }/><br/>
            <label>Price</label>
            <input type="decimal" className="form-control" name="product.price"  value={product.price} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,price:event.target.value}
            })
            }/><br/>
            <label>URL</label>
            <input type="url" className="form-control" name="product.url"  value={product.url} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,url:event.target.value}
            })
            }/><br/>
            <input type="submit" value={b1} className="btn btn-primary"/>
            <input type="reset" value="reset" onClick={resetFun} className="btn btn-secondary"/>
        </form>    

          <table className="table table-stripped">
            <thead>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                    <th>URL</th>
                    <th>Delete Product</th>
                    <th>Update Product</th>
                </tr>
            </thead>
            <tbody>
                {productRecord}
            </tbody>
          </table>
        </div>
    )
}

export default ProductOperation;