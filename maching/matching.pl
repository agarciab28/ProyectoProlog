

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

gustos(alejandro_fernandez,[cantar,actuar,orden,deporte,caballos,catolica,alcohol]).
gustos(takeshi,[tae_kwan_do,musica,comics,videojuegos]).
gustos(black_widow,[tae_kwan_do,musica,comics,videojuegos]).
gustos(samy,[desorden,espontaneo,playa,opinar,tortas,idiomas,catolica]).
gustos(erendira,[orden,limpieza,respeto,estudio,seriedad,cocinar,catolica,deporte]).

largo([],0).
largo([H|T],N):-largo(T,N0), N is N0 + 1.

member(X,[X|T]).
member(X,[_|T]):-member(X,T).

co([],L2,0).
co([X|T],L2,C):-member(X,L2),co(T,L2,C2),C is C2 + 1.
co([X|T],L2,C):-not(member(X,L2)),co(T,L2,C2),C is C2. 


pareja(H,M,Porcentaje,Porc_matching):-hombre(H),mujer(M),
                        gustos(H,Gh),gustos(M,Gm),
                        co(Gh,Gm,C),     
                        largo(Gh,L1),largo(Gm,L2),
                        GAmbos is L1 + L2, 
                        Prom is GAmbos / 2,
                        Porc_matching is ((C/Prom)*100),
                        Porc_matching>=Porcentaje.







%%                        C@>=2.









hombre(jotolon).
hombre(jotoloncin).