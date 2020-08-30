const express=require('express');
const mongoose=require('mongoose');

const toDo=require("../models.toDo");

router.get("/",async(req,res)+>)
try{
  const toDo=await toDo.find();
  const numOfThingsToDo=toDo.length;
}catch(err);
