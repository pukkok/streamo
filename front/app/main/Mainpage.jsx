import { useState } from 'react'
import Header from '../components/header/Header'
import SignModal from '../components/signModal/SignModal' // ← 이거 연결!
import HeroSection from '../components/hero/HeroSection'
import CategorySection from '../components/category/CategorySection'
import dummyCategory from '../components/category/dummyCategory'


const MainPage = () => {
  const [signInModalOpen, setSignInModalOpen] = useState(false)

  const openSignModal = () => {
    setSignInModalOpen(true)
  }

  const closeSignModal = () => {
    setSignInModalOpen(false)
  }

  return (
    <>
      <Header onLoginClick={openSignModal} />
      
      {signInModalOpen && (
        <SignModal onClose={closeSignModal} />
      )}

      {/* 히어로 섹션 넣기 */}
      <HeroSection />
      {/* 카테고리 리스트 넣기 */}
      <CategorySection title={dummyCategory.title} items={dummyCategory.items} />
    </>
  )
}

export default MainPage