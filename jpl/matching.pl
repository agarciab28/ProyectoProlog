hombre(alejandro_fernandez).
hombre(david_beckam).
hombre(takeshi).
hombre(antonio_banderas).
hombre(william_levy).
hombre(ashton_kucher).
hombre(brad_pitt).
hombre(will_smith).
hombre(samy).
hombre(hulk).

mujer(isis).
mujer(ana_karen).
mujer(erendira).
mujer(veronica).
mujer(ana_silvia).
mujer(black_widow).
mujer(aurora).
mujer(karla).
mujer(stephanie).
mujer(susana).

hola:-write('Hola Mundo').

gustos(alejandro_fernandez,[cantar,actuar,orden,deporte,caballos,catolica,alcohol]).
gustos(david_beckam,[deporte,bailar,comer,volar,viajar,comprar]).
gustos(takeshi,[tae_kwon_do,musica,comics,videojuegos]).
gustos(antonio_banderas,[guitarra,respeto,seriedad,deporte,espectaculos,cocinar,bailar]).
gustos(william_levy,[actuar,beber,orden,deporte,espectaculos,trabajar,videojuegos,fiesta,playa]).
gustos(brad_pitt,[actuar,deporte,playa,viajar,cocinar,opinar]).

gustos(susana,[actuar,bailar,playa,viajar,deporte,alcohol,espectaculos,guitarra,respeto]).
gustos(karla,[cafe,playa,alcohol,estudio,respeto,catolica,espectaculos,comics,musica,videojuegos]).
gustos(veronica,[guitarra,seriedad,libros,videojuegos,fiesta,cocinar,bailar,cantar,orden]).
gustos(black_widow,[tae_kwon_do,musica,comics,videojuegos]).
gustos(ana_karen,[desorden,espontaneo,playa,opinar,tortas,idiomas,catolica]).
gustos(erendira,[orden,limpieza,respeto,estudio,seriedad,cocinar,catolica,deporte]).

musica(alejandro_fernandez,[mariachi,banda,corridos]).
musica(takeshi,[rock,metal,mariachi,cumbias,jazz,soul]).
musica(david_beckam,[rock,metal,banda,corridos,bachata,cumbias,chachacha,jazz]).
musica(antonio_banderas,[romantica,baladas,mariachi,indie,jazz,country]).
musica(william_levy,[pop,dj,reggeton,dance,house,hiphop,rap,romantica,cumbias,salsa]).
musica(brad_pitt,[pop,romantica,clasica,baladas,chachacha,jazz,mariachi,corridos]).

musica(black_widow,[rock,metal,mariachi,cumbias]).
musica(erendira,[mariachi,banda,corridos,cumbias,indie,country,jazz]).
musica(susana,[hiphop,pop,romantica,banda,baladas,jazz,soul,rap,salsa,cumbias]).
musica(karla,[reggeton,salsa,cumbias,corridos,hiphop,rap,clasica]).
musica(veronica,[pop,rock,metal,mariachi,cumbias,country,salsa]).
musica(ana_karen,[hiphop,pop,romantica,banda,baladas,jazz,soul,rap,salsa,cumbias]).

comida(alejandro_fernandez,[tacos,pozole,atole,tamales]).
comida(takeshi,[tacos,asada,enchiladas,papas,zanahorias,legumbres,pizza,hamburguesa]).
comida(david_beckam,[pan,cafe,pastes,atole,enchiladas]).
comida(antonio_banderas,[paella,arroz,tamales,tacos,pizza,hamburguesa]).
comida(william_levy,[ostiones,rammen,atole,pizza,tamales,asada]).
comida(brad_pitt,[saltamontes,sardinas,ostiones,atole,pozole,arroz,paella,pastel,galletas]).


comida(black_widow,[tacos,asada,enchiladas,tamales,pollo,rammen,pastel]).
comida(erendira,[tacos,pozole,atole,tamales,pastel,ostiones,legumbres]).
comida(susana,[pozole,atole,enchiladas,hamburguesa,pizza,galletas,pastel]).
comida(karla,[tacos,pan,asada,papas,zanahorias,legumbres,rammen,saltamontes]).
comida(veronica,[pizza,hamburguesa,tamales,galletas,ostiones,pan]).
comida(ana_karen,[saltamontes,sardinas,legumbres,pizza,tacos,paella,pastel,pescado,tamales]).

largo([],0).
largo([_|T],N):-largo(T,N0), N is N0 + 1.

member(X,[X|_]).
member(X,[_|T]):-member(X,T).

co([],_,0).
co([X|T],L2,C):-member(X,L2),co(T,L2,C2),C is C2 + 1.
co([X|T],L2,C):-not(member(X,L2)),co(T,L2,C2),C is C2. 


pareja(H,M,Porcentaje,Porc_matching):-hombre(H),mujer(M),
                        gustos(H,Gh),gustos(M,Gm),
						musica(H,Mh),musica(M,Mm),
						comida(H,Ch),comida(M,Cm),
                        co(Gh,Gm,C),
                        co(Mh,Mm,C2),
                        co(Ch,Cm,C3),
                        Coincidencias is C + C2 + C3,
                        largo(Gh,L1),largo(Gm,L2),
                        largo(Mh,L3),largo(Mm,L4),
                        largo(Ch,L5),largo(Cm,L6),
                        GAmbos is L1 + L2 + L3 + L4 + L5 + L6, 
                        Prom is GAmbos / 2,
                        Porc_matching is ((Coincidencias/Prom)*100),
                        Porc_matching>=Porcentaje.




hombre(pepillo). 

gustos(pepillo,[musica,orden,respeto,alcohol,playa,viajar]).
musica(pepillo,[rock,pop,salsa,combia]).
comida(pepillo,[ostiones,paella,tacos,pan]).