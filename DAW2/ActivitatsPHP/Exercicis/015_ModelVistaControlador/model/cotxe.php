<?php

class Cotxe 
{
    private $id;
    private $marca;
    private $model;
    private $color;
    private $propietari;

    function __construct($mId, $mMarca, $mModel, $mColor, $mPropietari) {
        $this -> id = $mId;
        $this -> marca = $mMarca;
        $this -> model = $mModel;
        $this -> color = $mColor;
        $this -> propietari = $mPropietari;
    }

    function setId($mId) {
        $this -> id = $mId;
    }

    function setMarca($mMarca) {
        $this -> marca = $mMarca;
    }

    function setModel($mModel) {
        $this -> model = $mModel;
    }

    function setColor($mColor) {
        $this -> color = $mColor;
    }

    function setPropietari($mPropietari) {
        $this -> propietari = $mPropietari;
    }

    function getId() {
        return $this -> id;
    }

    function getMarca() {
        return $this -> marca;
    }

    function getModel() {
        return $this -> model;
    }

    function getColor() {
        return $this -> color;
    }

    function getPropietari() {
        return $this -> propietari;
    }
    
}
?>