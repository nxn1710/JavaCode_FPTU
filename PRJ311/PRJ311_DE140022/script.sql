USE [master]
GO
/****** Object:  Database [PRJ311_DE140022]    Script Date: 7/31/2020 3:18:54 PM ******/
CREATE DATABASE [PRJ311_DE140022]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PRJ311_DE140022', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\PRJ311_DE140022.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PRJ311_DE140022_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\PRJ311_DE140022_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [PRJ311_DE140022] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PRJ311_DE140022].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PRJ311_DE140022] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET ARITHABORT OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PRJ311_DE140022] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PRJ311_DE140022] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PRJ311_DE140022] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PRJ311_DE140022] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [PRJ311_DE140022] SET  MULTI_USER 
GO
ALTER DATABASE [PRJ311_DE140022] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PRJ311_DE140022] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PRJ311_DE140022] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PRJ311_DE140022] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [PRJ311_DE140022] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [PRJ311_DE140022] SET QUERY_STORE = OFF
GO
USE [PRJ311_DE140022]
GO
/****** Object:  Table [dbo].[Store_DE140022]    Script Date: 7/31/2020 3:18:55 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Store_DE140022](
	[Store_ID] [nchar](10) NOT NULL,
	[Store_Name] [nvarchar](20) NULL,
	[Address] [nvarchar](20) NULL,
	[Phone] [nchar](10) NULL,
 CONSTRAINT [PK_Store_DE140022] PRIMARY KEY CLUSTERED 
(
	[Store_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST01      ', N'Da Nang Store', N'Da Nang', N'0373636367')
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST02      ', N'Quang Nam Store', N'Quang Nam', N'0383882737')
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST03      ', N'Ha Noi Store', N'Ha Noi', N'0938737234')
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST04      ', N'Hoi An Store', N'Hoi An', N'0993838876')
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST06      ', N'Quang Nam Store', N'Quang Nam', N'0383882737')
INSERT [dbo].[Store_DE140022] ([Store_ID], [Store_Name], [Address], [Phone]) VALUES (N'ST07      ', N'Quang Nam Store', N'Quang Nam', N'0383882737')
GO
USE [master]
GO
ALTER DATABASE [PRJ311_DE140022] SET  READ_WRITE 
GO
