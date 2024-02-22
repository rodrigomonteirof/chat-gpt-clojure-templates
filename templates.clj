; Template de Função Controller 'require' para Entidade
(ns [project].controllers.[entity]
  (:require [schema.core :as s]
    [[project].models.[entity] :as models.[entity]]
    [[project].db.[entity] :as db.[entity]]
    [[project].protocols.datomic :as protocols.datomic]))
; Substitua [entity] e [Entity] pelo nome específico da entidade.
; Substitua [project] pelo nome do projeto.

; Template de Função Controller 'create!' para Entidade
(s/defn create! :- models.[entity]/[Entity]
      [[entity]-request :- models.[entity]/[Entity]Request
       datomic :- protocols.datomic/IDatomic]
      (db.[entity]/create! [entity]-request datomic))

; Substitua [entity] e [Entity] pelo nome específico da entidade.
; Substitua [project] pelo nome do projeto.
