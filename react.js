import React from 'react'
import Header from './components/Header'

class App extend React.Components{
  return(
    <div className='container'
    <Header title='Hello '/>
    </div>
  )
}
export default App

const Header=(props)=>{
  return(
    <header className='header'>
      <h1>{title}</h1>
      buttone className='btn'>Add</button>
    </header>
  )

  )
}
const Buttons={(color,text)}=>{
  return(
    <button style={{backgroundColor: color}}>
    className='btn'
      {text}
      </button>
  )
}
export default Header

Header.defaultProps={
  title: PropTypes.string.isRequired,
}
Header.defaultProps={
  title:'Task Tracker',
}
footer{
  margin-top: 30px;
  text-align: center;

}
const App=()=>{
  const [tasks,setTacks]=useStates([
    {
      id;1,
      text:'Doctors Appoitment',
      day:'Fed 5th at 2:30 pm'
      reminder:true,
    }
    {
      id:2
      text:'Meeting at School'
      day:'Fed 6th at 1:30 pm'
      reminder;true;
    }
}

const Task=({task, onDelete, onToggle})=>{
  return(
    <div className={'task ${}'}'} onDoubleClick={
      ()=>onToggle(task.id)}>
      <h3>
       {task.txt}{' '}
       <FaTimes
         style={{color:'red',cursor:
       'pointer'}}
       onClick={()=>onDelete(task.id)}
       />
       <h3>
       <p>{task.day}</p>
       </div>
     )
    }'
  )
}
