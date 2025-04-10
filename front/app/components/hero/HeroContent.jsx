'use client'

import Link from 'next/link'
import PlayIcon from '../icons/PlayIcon'
import HeartIcon from '../icons/HeartIcon'

const HeroContent = ({ title, description, age, views, runtime, genre }) => {
  return (
    <div className="absolute bottom-14 left-0 text-white max-w-[500px] z-10">
      <h2 className="text-4xl font-bold mb-3">{title}</h2>
      <p className="text-sm mb-5 opacity-80">
        {age} ・ {views} views ・ {runtime} ・ {genre}
      </p>
      <p className="text-sm mb-6 line-clamp-2">{description}</p>
      <div className="flex items-center gap-4 mt-6">

        <Link href="/" className="
          flex items-center gap-2
          px-4 py-2
          text-sm font-bold
          border-2 border-[#ffbb00] text-[#ffbb00]
          rounded-full
          transition-all duration-200 ease-in-out
          hover:bg-[#ffbb00] hover:text-black
          cursor-pointer
        ">
          <PlayIcon /> 바로보기
        </Link>

        <button className="
          flex items-center gap-2
          px-4 py-2
          text-sm font-semibold
          border border-white text-white
          rounded-full
          transition-all duration-200 ease-in-out
          hover:border-[#ffbb00] hover:text-[#ffbb00]
          cursor-pointer
        ">
          <HeartIcon /> 좋아요
        </button>
      </div>
    </div>
  )
}

export default HeroContent
