'use client'

import Logo from './Logo'
import NavMenu from './NavMenu'
import SearchBar from './SearchBar'
import LoginButton from './LoginButton'
import Container from '../Container'

const Header = ({ onLoginClick }) => {

  return (
    <header className="bg-[#111]">
      <Container className='flex items-center gap-12
    py-4 bg-[#111] shadow-md'>
        <Logo />
        <NavMenu />
        <SearchBar />
        <div className="flex items-center gap-4 ml-auto">
          <LoginButton onClick={onLoginClick} />
        </div>
      </Container>
    </header>
  )
}

export default Header
