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
gustos(takeshi,[tae_kwan_do,musica,comics,videojuegos]).
gustos(black_widow,[tae_kwan_do,musica,comics,videojuegos]).
gustos(samy,[desorden,espontaneo,playa,opinar,tortas,idiomas,catolica]).
gustos(erendira,[orden,limpieza,respeto,estudio,seriedad,cocinar,catolica,deporte]).

musica(alejandro_fernandez,[mariachi,banda,corridos]).
musica(takeshi,[rock,metal,mariachi,cumbias]).
musica(black_widow,[rock,metal,mariachi,cumbias]).
musica(erendira,[mariachi,banda,corridos]).

comida(alejandro_fernandez,[tacos,pozole,atole,tamales]).
comida(takeshi,[tacos,asada,enchiladas]).
comida(black_widow,[tacos,asada,enchiladas]).
comida(erendira,[tacos,pozole,atole,tamales]).

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